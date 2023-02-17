package service;

import model.Medcin;
import model.Service;
import model.Specialite;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class MedcinService extends AbstractFacade<Medcin> implements IMedcin {

    private Session session;

    public MedcinService(){
        super(Medcin.class);
        session = HibernateUtil.getSession();
    }


    @Override
    public Session getSession() {
        return session;
    }


}
