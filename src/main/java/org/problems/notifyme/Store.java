package org.problems.notifyme;

import org.problems.notifyme.observable.SkuObservable;
import org.problems.notifyme.observable.SkuObservableImpl;
import org.problems.notifyme.observer.EmailAlertObserver;
import org.problems.notifyme.observer.NotificationAlertObserver;

public class Store {

  public static void main(String[] args) {
    SkuObservable skuObservable = new SkuObservableImpl();

    NotificationAlertObserver observer1 = new EmailAlertObserver("kenaa@example.com", skuObservable);
    NotificationAlertObserver observer2 = new EmailAlertObserver("kemaa@example.com", skuObservable);

    skuObservable.subscribe(observer1);
    skuObservable.subscribe(observer2);

    skuObservable.setSkuCount(1);
  }
}
