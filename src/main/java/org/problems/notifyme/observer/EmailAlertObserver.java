package org.problems.notifyme.observer;

import org.problems.notifyme.observable.SkuObservable;

public class EmailAlertObserver implements NotificationAlertObserver {

  private final String emailId;
  private final SkuObservable skuObservable;

  public EmailAlertObserver(String emailId, SkuObservable skuObservable) {
    this.emailId = emailId;
    this.skuObservable = skuObservable;
  }

  @Override
  public void update() {
    final String message = String.format("New stock added. Only %s left", skuObservable.getSkuCount());
    sendEmail(emailId, message);
  }

  private void sendEmail(String emailId, String message) {
    System.out.printf("Sending email to %s: %s%n", emailId, message);
  }
}
