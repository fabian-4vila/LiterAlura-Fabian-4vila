package com.fabianavila.LiterAlura.service;

public interface IConversor {
    <T> T obtenerDatos(String json, Class<T> clase);
}
