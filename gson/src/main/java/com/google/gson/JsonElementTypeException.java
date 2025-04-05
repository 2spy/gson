// com.google.gson.JsonElementTypeException.java
package com.google.gson;

/**
 * Exception lancée lorsqu'une méthode de conversion de type JsonElement est appelée
 * sur un élément JSON dont le type ne correspond pas.
 */
public class JsonElementTypeException extends RuntimeException {

  private final String expectedType;
  private final String actualType;

  /**
   * Crée une nouvelle exception avec les informations sur les types attendu et réel.
   *
   * @param expectedType Le type attendu de l'élément JSON
   * @param actualType Le type réel de l'élément JSON
   */
  public JsonElementTypeException(String expectedType, String actualType) {
    super(String.format("Expected %s but got %s", expectedType, actualType));
    this.expectedType = expectedType;
    this.actualType = actualType;
  }

  /**
   * @return Le type attendu de l'élément JSON
   */
  public String getExpectedType() {
    return expectedType;
  }

  /**
   * @return Le type réel de l'élément JSON
   */
  public String getActualType() {
    return actualType;
  }
}