// src/main/java/com/google/gson/api/JsonDeserializationContext.java
package com.google.gson.api;

import java.lang.reflect.Type;

/**
 * Contexte pour la désérialisation JSON.
 * Cette interface permet aux adaptateurs personnalisés d'invoquer la désérialisation d'autres objets.
 */
public interface JsonDeserializationContext {
    /**
     * Désérialise l'élément JSON en un objet du type spécifié.
     *
     * @param <T> le type générique de l'objet de retour
     * @param json l'élément JSON à désérialiser
     * @param typeOfT le type de l'objet à retourner
     * @return un objet du type spécifié
     */
    <T> T deserialize(Object json, Type typeOfT);
}