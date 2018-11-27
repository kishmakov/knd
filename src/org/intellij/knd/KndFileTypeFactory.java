package org.intellij.knd;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class KndFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(KndFileType.INSTANCE);
    }
}
