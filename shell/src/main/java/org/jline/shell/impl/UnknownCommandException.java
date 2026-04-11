/*
 * Copyright (c) the original author(s).
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * https://opensource.org/licenses/BSD-3-Clause
 */
package org.jline.shell.impl;

public class UnknownCommandException extends RuntimeException {

    private static final long serialVersionUID = 3184448976067428498L;

    public UnknownCommandException(String message) {
        super(message);
    }
}
