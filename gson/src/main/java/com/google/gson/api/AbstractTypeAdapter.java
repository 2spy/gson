// src/main/java/com/google/gson/api/AbstractTypeAdapter.java
package com.google.gson.api;

import java.io.IOException;

/**
 * Classe abstraite de base pour les adaptateurs de types.
 * Cette classe fournit la structure de base pour tous les adaptateurs.
 *
 * @param <T> le type que cet adaptateur peut sérialiser et désérialiser
 */
public abstract class AbstractTypeAdapter<T> {
    /**
     * Écrit une valeur de type T dans un équivalent JSON.
     *
     * @param out le writer JSON vers lequel écrire
     * @param value la valeur à écrire
     * @throws IOException si une erreur d'E/S se produit
     */
    public abstract void write(Object out, T value) throws IOException;

    /**
     * Lit une valeur de type T depuis un équivalent JSON.
     *
     * @param in le reader JSON depuis lequel lire
     * @return la valeur lue
     * @throws IOException si une erreur d'E/S se produit
     */
    public abstract T read(Object in) throws IOException;
}