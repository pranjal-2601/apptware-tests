/** This class is expected to be a singleton. Please make necessary changes. */
package com.apptware.interview.singleton;

public enum Singleton {
  INSTANCE;

  public final String s = "Hello I am a string part of Singleton class";

  public static Singleton getInstance() {
    return INSTANCE;
  }
}
