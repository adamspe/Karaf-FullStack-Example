package com.notio.example.fse.spi;

import java.io.IOException;

import javax.activation.DataSource;

import com.notio.example.fse.Document;
import com.notio.example.fse.FseException;
import com.notio.example.fse.NoSuchObjectException;

public interface DocumentService extends CrudService<Document> {
    /**
     * Given a DataSource create a new document or update an existing document with the same name.
     *
     * @param d The DataSource.
     * @return The new or updated Document.
     * @throws FseException
     * @throws IOException
     */
    Document createOrUpdate(DataSource d) throws FseException,IOException;
    /**
     * Given a Document download its contents.
     *
     * @param d The document.
     * @return A DataSource that gives access to its contents.
     * @throws FseException
     * @throws NoSuchObjectException
     * @throws IOException
     */
    DataSource download(Document d) throws FseException,NoSuchObjectException,IOException;
}
