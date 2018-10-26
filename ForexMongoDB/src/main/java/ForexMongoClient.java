import java.util.Date;

import forex.genetic.dao.mongodb.IndividuosDAO;
import forex.genetic.dao.mongodb.MongoTendenciaParaOperarDAO;
import forex.genetic.entities.TendenciaParaOperar;
import forex.genetic.util.Constants.OperationType;

public class ForexMongoClient {

	public static void main(String[] args) {
		IndividuosDAO dao = new IndividuosDAO();
		dao.saveIndividuo();
		dao.listIndividuos("2018102516303");
		dao.listAllIndividuos();

		MongoTendenciaParaOperarDAO tpoDao = new MongoTendenciaParaOperarDAO();

		for (int i = 0; i < 150000; i++) {
			TendenciaParaOperar tpo = new TendenciaParaOperar();
			tpo.setTipoExportacion("DFDFSD");
			tpo.setActiva(1);
			tpo.setFecha(new Date());
			tpo.setFechaBase(new Date());
			tpo.setFechaTendencia(new Date());
			tpo.setTipoOperacion(OperationType.SELL);
			tpo.setPeriodo("1440");

			tpoDao.insertTendenciaParaOperar(tpo);
		}
	}

}
