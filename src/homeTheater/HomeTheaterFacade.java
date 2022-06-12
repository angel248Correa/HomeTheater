package homeTheater;

public class HomeTheaterFacade {
 amplifier amp; 
 Tuner tuner; 
 StreamingPlayer player; 
 Projector projector; 
 theaterLights Light; 
 Screen screen; 
 PopcornPopper popper; 
 
 public HomeTheaterFacade(amplifier amp, 
 Tuner tuner, 
 StreamingPlayer player, 
 Projector projector, 
 theaterLights Light, 
 Screen screen, 
 PopcornPopper popper ) {
	  this.amp = amp; 
	  this.tuner = tuner; 
	   this.player = player; 
	   this.projector = projector; 
	   this.Light = Light;
	   this.screen = screen; 
	   this.popper = popper;
	 
 }
 public void watchMovie(String movie) { 
	 System.out.println("get ready to watch a movie");
	 popper.on(); 
	 popper.pop();
	 Light.dim(10); 
	 screen.down();
	 projector.on(); 
	 projector.wideScreenMode(); 
	 amp.on();
	 amp.setStreamingPlayer(player); 
	 amp.setSurroundSound();
	 amp.setVolume(5);
	 player.on();
	 player.play(movie);
		 
	 
	 
 }
 public void endMovie() { 
	 System.out.println("shutting movie theater down... ");
	 popper.off(); 
	 Light.on(); 
	 screen.up();
	 projector.off(); 
	 amp.off(); 
	 player.stop(); 
	 player.off(); 
 }
}
