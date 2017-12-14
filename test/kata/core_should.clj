(ns kata.core_should
  (:require [midje.sweet :refer :all]
            [kata.core :refer :all]))

(facts
  "About score keeper"
  (fact "Local scores a point"
        (-> (start-match)
            local-scores-one-point) => {:local 1 :visitor 0})

  (fact "Local scores two points"
        (-> (start-match)
            local-scores-two-points) => {:local 2 :visitor 0})

  (fact "Local scores three points"
        (-> (start-match)
            local-scores-three-points) => {:local 3 :visitor 0})

  (fact "Local chains different points"
        (-> (start-match)
            local-scores-one-point
            local-scores-three-points
            local-scores-two-points) => {:local 6 :visitor 0})

  (fact "Visitor scores a point"
        (-> (start-match)
            visitor-scores-one-point) => {:local 0 :visitor 1})

  (fact "Visitor scores two points"
        (-> (start-match)
            visitor-scores-two-points) => {:local 0 :visitor 2})

  (fact "Visitor scores three points"
        (-> (start-match)
            visitor-scores-three-points) => {:local 0 :visitor 3})

  (fact "Visitor chains different points"
        (-> (start-match)
            visitor-scores-one-point
            visitor-scores-three-points
            visitor-scores-two-points) => {:local 0 :visitor 6})

  (fact "Visitor and local chains different points"
      (-> (start-match)
          visitor-scores-one-point
          local-scores-three-points
          local-scores-one-point
          visitor-scores-three-points
          local-scores-two-points
          local-scores-three-points
          local-scores-three-points
          visitor-scores-two-points) => {:local 12 :visitor 6}))
