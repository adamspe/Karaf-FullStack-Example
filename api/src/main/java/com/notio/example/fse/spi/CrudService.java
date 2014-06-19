package com.notio.example.fse.spi;

import com.notio.example.fse.FseEntity;
import com.notio.example.fse.FseException;
import com.notio.example.fse.NoSuchObjectException;

/**
 * Base interface for services supporting basic create, read, update and delete on entities.
 *
 * @param <T> The concrete entity class.
 */
public interface CrudService<T extends FseEntity> {
    /**
     * Fetch an entity by id.
     *
     * @param id The id.
     * @return The entity.
     * @throws NoSuchObjectException If no object with the id exists.
     */
    T get(int id) throws FseException,NoSuchObjectException;
    /**
     * Create a new entity.
     *
     * @param t The entity.
     * @throws FseException
     */
    void create(T t) throws FseException;
    /**
     * Update an existing entity.
     *
     * @param t The entity.
     * @throws FseException
     * @throws NoSuchObjectException If no object with the id exists.
     */
    void update(T t) throws FseException,NoSuchObjectException;
    /**
     * Delete an existing entity.
     *
     * @param t The entity.
     * @throws FseException
     * @throws NoSuchObjectException If no object with the id exists.
     */
    void delete(T t) throws FseException,NoSuchObjectException;
}
