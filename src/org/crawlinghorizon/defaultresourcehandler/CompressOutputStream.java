/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crawlinghorizon.defaultresourcehandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author victory
 */
public class CompressOutputStream extends GZIPOutputStream {

    public CompressOutputStream(OutputStream out) throws IOException {
        super(out);
    }
}
