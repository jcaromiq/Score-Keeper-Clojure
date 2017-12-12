(ns kata.core_should
    (:require [midje.sweet :refer :all]
      [kata.core :refer :all]))

(facts
  "About score keeper"
  (fact  "Team A scores a point" (score-team-a) => {:teamA 1 :teamB 0})
  (fact  "Team A scores two points" (score-team-a-2) => {:teamA 2 :teamB 0})
  (fact  "Team A scores three points" (score-team-a-3) => {:teamA 3 :teamB 0})
  (fact  "Team A chains different points"
         ((comp score-team-a score-team-a-3 score-team-a-2)) => {:teamA 6 :teamB 0})

)