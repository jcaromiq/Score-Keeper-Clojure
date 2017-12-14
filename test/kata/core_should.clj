(ns kata.core_should
  (:require [midje.sweet :refer :all]
            [kata.core :refer :all]))

(facts
  "About score keeper"
  (fact "Team A scores a point"
        (-> (start-match)
            score-team-a) => {:teamA 1 :teamB 0})

  (fact "Team A scores two points"
        (-> (start-match)
            score-team-a-2) => {:teamA 2 :teamB 0})

  (fact "Team A scores three points"
        (-> (start-match)
            score-team-a-3) => {:teamA 3 :teamB 0})

  (fact "Team A chains different points"
        (-> (start-match)
            score-team-a
            score-team-a-3
            score-team-a-2) => {:teamA 6 :teamB 0})

  (fact "Team B scores a point"
        (-> (start-match)
            score-team-b) => {:teamA 0 :teamB 1})

  (fact "Team B scores two points"
        (-> (start-match)
            score-team-b-2) => {:teamA 0 :teamB 2})

  (fact "Team B scores three points"
        (-> (start-match)
            score-team-b-3) => {:teamA 0 :teamB 3})

  (fact "Team B chains different points"
        (-> (start-match)
            score-team-b
            score-team-b-3
            score-team-b-2) => {:teamA 0 :teamB 6}))

