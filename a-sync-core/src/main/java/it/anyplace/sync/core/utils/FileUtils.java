/* 
 * Copyright (C) 2016 Davide Imbriaco
 *
 * This Java file is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.anyplace.sync.core.utils;

import it.anyplace.sync.core.configuration.ConfigurationService;
import java.io.File;
import java.util.UUID;

public class FileUtils {

    public static File createTempFile(ConfigurationService configuration) {
        File tempFile = new File(configuration.getTemp(), UUID.randomUUID().toString());
        tempFile.deleteOnExit();
        return tempFile;
    }

}
