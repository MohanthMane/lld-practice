package org.problems.notifyme.observable;

import java.util.ArrayList;
import java.util.List;
import org.problems.notifyme.observer.NotificationAlertObserver;

public class SkuObservableImpl implements SkuObservable {

  private List<NotificationAlertObserver> observers = new ArrayList<>();
  private int skuCount = 0;

  @Override
  public void subscribe(NotificationAlertObserver observer) {
    observers.add(observer);
  }

  @Override
  public void unsubscribe(NotificationAlertObserver observer) {
    observers.remove(observer);
  }

  @Override
  public void notifySubscribers() {
    observers.forEach(NotificationAlertObserver::update);
  }

  @Override
  public void setSkuCount(int count) {
    skuCount = count;
    if (skuCount > 0) {
      notifySubscribers();
    }
  }

  @Override
  public int getSkuCount() {
    return skuCount;
  }
}
