(ns kata.core)

(defn start-match
  []
  {:local 0 :visitor 0})

(defn local-scores-one-point
   ([score] (assoc score :local (+ (:local score) 1))))

(defn local-scores-two-points
  ([score] (assoc score :local (+ (:local score) 2))))

(defn local-scores-three-points
  ([score] (assoc score :local (+ (:local score) 3))))


(defn visitor-scores-one-point
  ([score] (assoc score :visitor (+ (:visitor score) 1))))

(defn visitor-scores-two-points
  ([score] (assoc score :visitor (+ (:visitor score) 2))))

(defn visitor-scores-three-points
  ([score] (assoc score :visitor (+ (:visitor score) 3))))