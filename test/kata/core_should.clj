(ns kata.core_should
    (:require [midje.sweet :refer :all]
      [kata.core :refer :all]))

(facts
  "about Kata"
  (fact
    "print hello world"
    (hello-world) => "Hello world"

  )
  
)