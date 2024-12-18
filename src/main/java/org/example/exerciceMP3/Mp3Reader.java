package org.example.exerciceMP3;


class Mp3  {
    public byte[] getStream() {
        return "mp3".getBytes();
    }
}

class Mp4 {
    public String getStream() {
        return "Video mp4";
    }
}

class mp4tomp3 extends mp3 {

    private Mp4 mp4;

    public mp4tomp3(Mp4 mp4) {
        this.mp4 = mp4;
    }

    @Override
    public byte[] getStream() {
        return mp4.getStream().getBytes();
    }
}

public class Mp3Reader {
    public void read(mp4tomp3 mp3) {
    System.out.println("Reading mp3" + mp4tomp3.getStream());
    }
}





