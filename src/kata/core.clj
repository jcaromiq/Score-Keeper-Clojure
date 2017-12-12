(ns kata.core)

(defn score-team-a
  ([] {:teamA 1 :teamB 0})
   ([score] (assoc score :teamA (+ (:teamA score) 1))))

(defn score-team-a-2
  ([] {:teamA 2 :teamB 0})
  ([score] (assoc score :teamA (+ (:teamA score) 2))))

(defn score-team-a-3
  ([]  {:teamA 3 :teamB 0})
  ([score] (assoc score :teamA (+ (:teamA score) 3))))
