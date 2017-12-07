(ns kata.core_should
    (:require [midje.sweet :refer :all]
      [kata.core :refer :all]))

(facts
  "About score keeper"
  (fact
    "Team A scores a point "
    (score-team-a) => 1

  )
  
)