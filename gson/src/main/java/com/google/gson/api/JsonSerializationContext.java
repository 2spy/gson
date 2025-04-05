// src/main/java/com/google/gson/api/JsonSerializationContext.java
package com.google.gson.api;

import java.lang.reflect.Type;

/**
 * Contexte pour la sérialisation JSON.
 * Cette interface permet aux adaptateurs personnalisés d'invoquer la sérialisation d'autres objets.
 */
public interface JsonSerializationContext {
    /**
     * Sérialise l'objet spécifié en tenant compte du type fourni.
     *
     * @param src l'objet à sérialiser
     * @param typeOfSrc le type de l'objet à sérialiser
     * @return un élément JSON représentant l'objet sérialisé
     */
    Object serialize(Object src, Type typeOfSrc);
}