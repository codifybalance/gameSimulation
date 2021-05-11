package Abstract;
import Entities.Gamer;

public interface IGamerService {
	void Save(Gamer gamer);
	void Delete(Gamer gamer);
	void Update(Gamer gamer);
}
