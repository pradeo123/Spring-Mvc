package com.prasadcode.spring.controller;

import org.springframework.lang.NonNull;

public class MainClass {

	  @NonNull
	  private String primary;
	  private String secondary;

	  public MainClass(String color) {
	    if (color != null) {
	      secondary = null;
	    }
	    primary = color;  // Noncompliant; "primary" is Nonnull but could be set to null here
	  }

	  public MainClass() { // Noncompliant; "primary" is Nonnull but is not initialized
	  }

	  @NonNull
	  public String indirectMix() {
	    String mix = null;
	    return mix;  // Noncompliant; return value is Nonnull, but null is returned.
	  }
}