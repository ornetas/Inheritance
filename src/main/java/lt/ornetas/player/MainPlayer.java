package lt.ornetas.player;

public class MainPlayer {
    public static void main(String[] args) {


        Player player = new Player();
        MusicCd musicCd01 = new MusicCd("Sting");
        MusicCd musicCd02 = new MusicCd("Radzis");
        MusicCd musicCd03 = new MusicCd("Cicinas");

        player.run(musicCd01);
        player.run(musicCd02);
        player.run(musicCd03);

        VideoDvd videoDvd01 = new VideoDvd("Terminator");
        VideoDvd videoDvd02 = new VideoDvd("Radzio koncertas");
        VideoDvd videoDvd03 = new VideoDvd("Cicino koncertas");

        player.run(videoDvd01);
        player.run(videoDvd02);
        player.run(videoDvd03);

        VideoBlueRay videoBlueRay01 = new VideoBlueRay("BlueRayVideo01");
        VideoBlueRay videoBlueRay02 = new VideoBlueRay("BlueRayVideo02");
        VideoBlueRay videoBlueRay03 = new VideoBlueRay("BlueRayVideo03");

        player.run(videoBlueRay01);
        player.run(videoBlueRay02);
        player.run(videoBlueRay03);





    }
}
