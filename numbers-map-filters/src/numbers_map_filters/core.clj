(ns numbers-map-filters.core
  (:gen-class))

;; problem solved in 3 ways

(defn -main [& args]
  (println (->> (remove #(not= (mod % 5) 0) (range 1 101)) (reduce +)))
  (println (->> (filter #(= (mod % 5) 0) (range 1 101)) (reduce +)))
  (println (reduce + (map #(* % 5) (range 1 21)))))
