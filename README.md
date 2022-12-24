# bee-escape

I have included an additional pdf with images showing examples of the gameplay.

How to run program:
	To run this game, open in the Eclipse IDE, open src folder and press run in the main BeeGame class.

Classes and their purposes:
	BeeGame class: This is the main class of my program. This class instantiates a JFrame and creates 
	the games layout, including JPanels for score and instructions, as well as JPanel for the gameplay.
	
	Canvas class: This class creates a JPanel for the gameplay. This class creates methods to paint 
	the JPanel, like drawing the player, obstacles and background image. This class also creates methods
	 for animation.
	 
	Bee class: This class instantiates variables to use for the "Bee" component, or the component that
	 the player controls.
	 
	Gravity class, Jump class, and MoveHands class: 
		These classes are for animation, and instantiate a timer that is used to call methods defined
		 in the Canvas Class. For example, adding gravity to the player, acceleration, and moving the
		  obstacles across the game's screen.
		
	Score class: This class updates the score to the game, as the gameplay is based on time, and how 
	long you play.
	
	Hand and TopHand class: This class defines variables needed for the hands or obstacles that move
	 across the screen, for example things like width, height and coordinates.
	
	Keys Class: This class extends the KeyListener and allows for key controls to move the player. 
	For example up arrow and enter keys.
	
	Hex Class: This class defines the hex component or the items that the user can collect in the game.

Game Mechanics:
	The game starts with pressing the enter key. The gameplay should start and the hands should move 
	towards the left of the screen. You control a bee, which has the goal of escaping from the human 
	hands that try to catch it. The up arrow allows you to jump and move away from obstacles.
	
	Animation:
		I used ActionListeners and timers to create moving obstacles (hands) that continuously move 
		towards the left of the screen. I also used timers to create gravity that pulls the player down
		as well as jumping.
	Interactive:
		The user is able to interact with the game using the up arrow key.
	Scoring Mechanism:
		There is a displayed scoreboard that shows a score that increases as the game progresses.
	Definitive Ending Mechanism:
		If the player collides into one of the obstacles, the game ends.
	Physical Mechanism:
		I created gravity that allows the player to stay afloat in the air using the arrow key.
		The user can also accelerate upward using the arrow key.
	Collision Detection:
		When the player collides with an obstacle, the collision is detected and the game ends.
