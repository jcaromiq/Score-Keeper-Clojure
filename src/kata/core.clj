(ns kata.core)

(defn start-match
  []
  {:teamA 0 :teamB 0})

(defn score-team-a
   ([score] (assoc score :teamA (+ (:teamA score) 1))))

(defn score-team-a-2
  ([score] (assoc score :teamA (+ (:teamA score) 2))))

(defn score-team-a-3
  ([score] (assoc score :teamA (+ (:teamA score) 3))))


(defn score-team-b
  ([score] (assoc score :teamB (+ (:teamB score) 1))))

(defn score-team-b-2
  ([score] (assoc score :teamB (+ (:teamB score) 2))))

(defn score-team-b-3
  ([score] (assoc score :teamB (+ (:teamB score) 3))))