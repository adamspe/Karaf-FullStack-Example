/*******************************************************************************
 * The MIT License (MIT)
 * 
 * Copyright (c) 2014 Paul Adams (adamspe@notiosoftware.com)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package com.notio.example.fse.spi;

import java.util.List;

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
    /**
     * List all entities of a given type (note in a real application would be unlikely to scale).
     *
     * @return The list of entities.
     * @throws FseException
     */
    List<T> list() throws FseException;
}
