package service;

import model.Service;
import model.Specialite;
import org.hibernate.Session;
import utils.HibernateUtil;

public class SpecialiteService  extends AbstractFacade<Specialite> implements  ISpecialite {

    private Session session;

    public SpecialiteService()
    {
        super(Specialite.class);
        session = HibernateUtil.getSession();
    }


    @Override
    public Session getSession() {
        return session;
    }

}
