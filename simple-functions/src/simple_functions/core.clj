(ns simple-functions.core
  (:gen-class))

(defn ten-times [arg]
  (* arg 10))

(defn plus-one-whole-square [arg]
  (* (+ 1 arg) (+ 1 arg)))

(def combine-two-functions
  (comp ten-times plus-one-whole-square))

(defn ten-times-square [arg]
  (plus-one-whole-square (ten-times arg)))

(defn tell-me-about-rectangle [length,width]
  (str "Rectangle with sides " 
    length "," 
    width "; area=" 
    (* length width) "; circumference=" 
    (* 2 (+ length width)) "."))

(defn be-positive [arg]
  (if(< arg 0)
    (* -1 arg)
    arg))

(defn -main []
  (println (ten-times 23))
  (println (plus-one-whole-square 5))
  (println (combine-two-functions 1))
  (println (ten-times-square 1))
  (println (tell-me-about-rectangle 12 4))
  (println (be-positive -23)))
  
