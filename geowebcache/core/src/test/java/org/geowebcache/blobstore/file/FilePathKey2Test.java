package org.geowebcache.blobstore.file;

import junit.framework.TestCase;

import org.geowebcache.storage.blobstore.file.FilePathGenerator;

public class FilePathKey2Test extends TestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    public void testPadder() throws Exception {
        String actual = FilePathGenerator.zeroPadder(0, 1);
        assertEquals("0", actual);
        
        actual = FilePathGenerator.zeroPadder(1, 2);
        assertEquals("01", actual);
        
        actual = FilePathGenerator.zeroPadder(1, 3);
        assertEquals("001", actual);
        
        actual = FilePathGenerator.zeroPadder(12, 2);
        assertEquals("12", actual);

        actual = FilePathGenerator.zeroPadder(11, 2);
        assertEquals("11", actual);
        
        actual = FilePathGenerator.zeroPadder(10, 2);
        assertEquals("10", actual);
        
        actual = FilePathGenerator.zeroPadder(100, 2);
        assertEquals("100", actual);

        actual = FilePathGenerator.zeroPadder(101, 3);
        assertEquals("101", actual);
        
        actual = FilePathGenerator.zeroPadder(102, 3);
        assertEquals("102", actual);
        
        actual = FilePathGenerator.zeroPadder(103, 3);
        assertEquals("103", actual);
        
        actual = FilePathGenerator.zeroPadder(99, 2);
        assertEquals("99", actual);
        
        actual = FilePathGenerator.zeroPadder(99, 3);
        assertEquals("099", actual);
    }
    
//    public void testFilePath() throws Exception {
//        FilePathKey2 fpk = new FilePathKey2();
//        
//        String expected = "/tmp/gwc"+ File.separator +"EPSG_4326_00"+ File.separator 
//            +"0_0" + File.separator +"00_00.png";
//        int[] idx0 = {0,0,0};
//        String actual = fpk.createKey("/tmp/gwc", idx0, SRS.getEPSG4326(), ImageMime.png, null);
//        this.assertEquals(expected, actual);
//
//        expected = "/tmp/gwc"+ File.separator +"EPSG_4326_04"+ File.separator 
//            +"1_1" + File.separator +"15_15.png";
//        int[] idx1 = {15,15,4};
//        actual = fpk.createKey("/tmp/gwc", idx1, SRS.getEPSG4326(), ImageMime.png, null);
//        this.assertEquals(expected, actual);
//        
//        expected = "/tmp/gwc"+ File.separator +"EPSG_4326_04"+ File.separator 
//            +"0_0" + File.separator +"03_03.png";
//        int[] idx2 = {3,3,4};
//        actual = fpk.createKey("/tmp/gwc", idx2, SRS.getEPSG4326(), ImageMime.png, null);
//        this.assertEquals(expected, actual);
//        
//        expected = "/tmp/gwc"+ File.separator +"EPSG_4326_04"+ File.separator 
//        +"0_0" + File.separator +"03_03.png.kml";
//        int[] idx3 = {3,3,4};
//        actual = fpk.createKey("/tmp/gwc", idx3, SRS.getEPSG4326(), ImageMime.png, XMLMime.kml);
//        this.assertEquals(expected, actual);
//    }
}