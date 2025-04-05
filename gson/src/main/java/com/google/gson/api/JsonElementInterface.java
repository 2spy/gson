// src/main/java/com/google/gson/api/JsonElementInterface.java
package com.google.gson.api;

/**
 * Interface pour les éléments JSON.
 * Cette interface est la base de la hiérarchie des éléments JSON.
 */
public interface JsonElementInterface {
    /**
     * Vérifie si cet élément est un JsonArray.
     *
     * @return true si cet élément est un JsonArray, false sinon
     */
    boolean isJsonArray();

    /**
     * Vérifie si cet élément est un JsonObject.
     *
     * @return true si cet élément est un JsonObject, false sinon
     */
    boolean isJsonObject();

    /**
     * Vérifie si cet élément est un JsonPrimitive.
     *
     * @return true si cet élément est un JsonPrimitive, false sinon
     */
    boolean isJsonPrimitive();

    /**
     * Vérifie si cet élément est un JsonNull.
     *
     * @return true si cet élément est un JsonNull, false sinon
     */
    boolean isJsonNull();
}