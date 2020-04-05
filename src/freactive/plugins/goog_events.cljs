(ns freactive.plugins.goog-events
  (:require
    [freactive.dom :as dom]
    [goog.events :as events]))

(defn use-goog-events!
  "Replaces freactive.dom's native DOM event handling with goog.events."
  []
  (set! dom/listen! events/listen))
