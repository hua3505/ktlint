package com.pinterest.ktlint.diff;

import lombok.Builder;
import lombok.Getter;
import org.eclipse.jgit.lib.AnyObjectId;

@Getter
@Builder
public class BlobWrapper {

    private AnyObjectId blobId;

    private byte[] content;

}
