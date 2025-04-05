// src/main/java/com/google/gson/api/JsonProcessor.java
package com.google.gson.api;

import java.lang.reflect.Type;

/**
 * Interface principale pour les opérations de sérialisation et désérialisation JSON.
 * Cette interface extrait les fonctionnalités essentielles de la classe Gson.
 */
public interface JsonProcessor {
    /**
     * Sérialise un objet en chaîne JSON.
     *
     * @param src l'objet à sérialiser
     * @return une représentation JSON de l'objet
     */
    String toJson(Object src);

    /**
     * Sérialise un objet en chaîne JSON avec un type spécifié.
     *
     * @param src l'objet à sérialiser
     * @param typeOfSrc le type spécifique de l'objet source
     * @return une représentation JSON de l'objet
     */
    String toJson(Object src, Type typeOfSrc);

    /**
     * Désérialise une chaîne JSON en objet de la classe spécifiée.
     *
     * @param <T> le type générique de l'objet de retour
     * @param json la chaîne JSON à désérialiser
     * @param classOfT la classe de l'objet à retourner
     * @return un objet du type spécifié
     */
    <T> T fromJson(String json, Class<T> classOfT);

    /**
     * Désérialise une chaîne JSON en objet du type spécifié.
     *
     * @param <T> le type générique de l'objet de retour
     * @param json la chaîne JSON à désérialiser
     * @param typeOfT le type spécifique de l'objet à retourner
     * @return un objet du type spécifié
     */
    <T> T fromJson(String json, Type typeOfT);
}