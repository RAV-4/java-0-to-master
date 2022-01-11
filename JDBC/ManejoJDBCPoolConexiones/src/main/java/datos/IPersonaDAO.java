package datos;

import domain.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

public interface IPersonaDAO {
    
    List<PersonaDTO> select() throws SQLException ;
    
    int insert(PersonaDTO personaDTO) throws SQLException ;
    
    int update(PersonaDTO personaDTO) throws SQLException ;
    
    int delete(PersonaDTO personaDTO) throws SQLException ;
    
}
