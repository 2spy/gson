// src/main/java/com/google/gson/api/TypeAdapterFactoryInterface.java
package com.google.gson.api;

import java.lang.reflect.Type;

/**
 * Interface pour les factories de TypeAdapter.
 * Cette interface abstraite permet de créer des adaptateurs pour différents types.
 */
public interface TypeAdapterFactoryInterface {
    /**
     * Crée un TypeAdapter pour le type spécifié.
     *
     * @param <T> le type générique pour lequel créer un adaptateur
     * @param gson instance du processeur JSON
     * @param type le type token pour lequel créer un adaptateur
     * @return un TypeAdapter pour le type spécifié, ou null si cette factory ne peut pas créer d'adaptateur pour ce type
     */
    <T> Object create(Object gson, Type type);
}