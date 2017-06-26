/*
 *  Copyright (c) 2014-2017 Kumuluz and/or its affiliates
 *  and other contributors as indicated by the @author tags and
 *  the contributor list.
 *
 *  Licensed under the MIT License (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  https://opensource.org/licenses/MIT
 *
 *  The software is provided "AS IS", WITHOUT WARRANTY OF ANY KIND, express or
 *  implied, including but not limited to the warranties of merchantability,
 *  fitness for a particular purpose and noninfringement. in no event shall the
 *  authors or copyright holders be liable for any claim, damages or other
 *  liability, whether in an action of contract, tort or otherwise, arising from,
 *  out of or in connection with the software or the use or other dealings in the
 *  software. See the License for the specific language governing permissions and
 *  limitations under the License.
*/
package com.kumuluz.ee.common.wrapper;

import com.kumuluz.ee.common.Extension;
import com.kumuluz.ee.common.dependencies.EeComponentDependency;
import com.kumuluz.ee.common.dependencies.EeComponentOptional;
import com.kumuluz.ee.common.dependencies.EeExtensionType;

/**
 * @author Tilen Faganel
 * @since 2.3.0
 */
public class ExtensionWrapper {

    private Extension extension;
    private String name;
    private EeExtensionType type;
    private EeComponentDependency[] dependencies;
    private EeComponentOptional[] optionalDependencies;

    public ExtensionWrapper(Extension extension, String name, EeExtensionType type, EeComponentDependency[] dependencies, EeComponentOptional[] optionalDependencies) {
        this.extension = extension;
        this.name = name;
        this.type = type;
        this.dependencies = dependencies;
        this.optionalDependencies = optionalDependencies;
    }

    public Extension getExtension() {
        return extension;
    }

    public void setExtension(Extension extension) {
        this.extension = extension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EeExtensionType getType() {
        return type;
    }

    public void setType(EeExtensionType type) {
        this.type = type;
    }

    public EeComponentDependency[] getDependencies() {
        return dependencies;
    }

    public void setDependencies(EeComponentDependency[] dependencies) {
        this.dependencies = dependencies;
    }

    public EeComponentOptional[] getOptionalDependencies() {
        return optionalDependencies;
    }

    public void setOptionalDependencies(EeComponentOptional[] optionalDependencies) {
        this.optionalDependencies = optionalDependencies;
    }
}
