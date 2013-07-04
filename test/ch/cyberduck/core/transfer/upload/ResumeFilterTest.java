package ch.cyberduck.core.transfer.upload;

import ch.cyberduck.core.AbstractTestCase;
import ch.cyberduck.core.Host;
import ch.cyberduck.core.NullLocal;
import ch.cyberduck.core.NullPath;
import ch.cyberduck.core.NullSession;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.local.Local;
import ch.cyberduck.core.transfer.TransferStatus;
import ch.cyberduck.core.transfer.symlink.NullSymlinkResolver;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @version $Id$
 */
public class ResumeFilterTest extends AbstractTestCase {

    @Test
    public void testAccept() throws Exception {
        ResumeFilter f = new ResumeFilter(new NullSymlinkResolver());
        assertTrue(f.accept(new NullSession(new Host("h")), new NullPath("t", Path.FILE_TYPE) {
            @Override
            public Local getLocal() {
                return new NullLocal(null, "a") {
                    @Override
                    public boolean exists() {
                        return true;
                    }
                };
            }
        }));
    }

    @Test
    public void testPrepare() throws Exception {
        ResumeFilter f = new ResumeFilter(new NullSymlinkResolver());
        final NullPath t = new NullPath("t", Path.FILE_TYPE);
        t.setLocal(new NullLocal(null, "t"));
        t.attributes().setSize(7L);
        final TransferStatus status = f.prepare(new NullSession(new Host("h")), t);
        assertTrue(status.isResume());
        assertEquals(7L, status.getCurrent());
    }
}