(ns kata.core)

(defn start-match []  {:local 0 :visitor 0})

(defn- inc-by
  [by]
  #(+ % by))

(def one-point-to (inc-by 1))
(def two-points-to (inc-by 2))
(def three-points-to (inc-by 3))


(defn local-scores-one-point
   ([{local :local :as score}]
    (assoc score :local (one-point-to local))))

(defn local-scores-two-points
  ([{local :local :as score}]
   (assoc score :local (two-points-to local))))

(defn local-scores-three-points
  ([{local :local :as score}]
   (assoc score :local (three-points-to local))))

(defn visitor-scores-one-point
  ([{visitor :visitor :as score}]
   (assoc score :visitor (one-point-to visitor))))

(defn visitor-scores-two-points
  ([{visitor :visitor :as score}]
   (assoc score :visitor (two-points-to visitor))))

(defn visitor-scores-three-points
  ([{visitor :visitor :as score}]
   (assoc score :visitor (three-points-to visitor))))

(defn get-score [score] "000:000")