/*
 * Copyright 2013 Klarna AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.klarna.hiverunner.builder;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.File;

/**
 * Representation of a resource configuration
 */
class HiveResource {
    private final String targetFile;
    private final String stringSource;
    private final File fileSource;

    HiveResource(String targetFile, String stringSource) {
        this(targetFile, stringSource, null);
    }

    HiveResource(String targetFile, File fileSource) {
        this(targetFile, null, fileSource);
    }

    private HiveResource(String targetFile, String stringSource, File fileSource) {
        this.targetFile = targetFile;
        this.stringSource = stringSource;
        this.fileSource = fileSource;
    }

    String getTargetFile() {
        return targetFile;
    }

    String getStringSource() {
        return stringSource;
    }

    File getFileSource() {
        return fileSource;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
