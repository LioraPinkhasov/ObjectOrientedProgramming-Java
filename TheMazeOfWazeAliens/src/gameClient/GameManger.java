package gameClient;

import org.json.JSONException;
import org.json.JSONObject;

import Server.game_service;

public class GameManger
{
	int fruits;
	int moves;
	int grade;
	int robots;
	String graph;
	game_service gameServer;
	
	public GameManger(game_service gameServer) throws JSONException {
		this.gameServer = gameServer;
		updateServer();
	}
	
	public void updateServer() throws JSONException {
		JSONObject serverJSON = new JSONObject(gameServer.toString()).getJSONObject("GameServer");
		setFruits(serverJSON.getInt("fruits"));
		setMoves(serverJSON.getInt("moves"));
		setGrade(serverJSON.getInt("grade"));
		setRobots(serverJSON.getInt("robots"));
		setGraph(serverJSON.getString("graph"));
	}
	
	public int getFruits()
	{
		return fruits;
	}
	
	private void setFruits(int fruits)
	{
		this.fruits = fruits;
	}
	
	public int getMoves() 
	{
		return moves;
	}
	
	private void setMoves(int moves)
	{
		this.moves = moves;
	}
	
	public int getGrade()
	{
		return grade;
	}
	
	private void setGrade(int grade)
	{
		this.grade = grade;
	}
	
	public int getRobots()
	{
		return robots;
	}
	
	private void setRobots(int robots) {
		this.robots = robots;
	}
	
	public String getGraph() 
	{
		return graph;
	}
	
	private void setGraph(String grapg) {
		this.graph = grapg;
	}
}
