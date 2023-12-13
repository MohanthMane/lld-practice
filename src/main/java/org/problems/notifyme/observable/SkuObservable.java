package org.problems.notifyme.observable;

import org.problems.notifyme.observer.NotificationAlertObserver;

public interface SkuObservable {

  void subscribe(NotificationAlertObserver observer);
  void unsubscribe(NotificationAlertObserver observer);
  void notifySubscribers();
  void setSkuCount(int count);
  int getSkuCount();
}
