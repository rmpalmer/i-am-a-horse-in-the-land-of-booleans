(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (nil? x) false
      (if (false? x) false
          true)))

(defn abs [x]
  (if (< x 0) (* -1 x) x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0) true false))

(defn fizzbuzz [n]
  (cond (divides? 15 n) "gotcha!"
        (divides? 3  n) "fizz"
        (divides? 5  n) "buzz"
        :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond (number? x) (* 2 x)
        (empty? x) nil
        (or (list? x) (vector? x)) (* 2 (count x))
        :else true))

(defn leap-year? [year]
  (cond (divides? 100 year) (if (divides? 400 year) true false)
        (divides? 4 year) true
        :else false))
              

; '_______'
