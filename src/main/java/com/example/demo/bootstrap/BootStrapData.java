package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (partRepository.count()==0) {

            InhousePart chairLeg = new InhousePart();
            chairLeg.setName("Chair Leg");
            chairLeg.setInv(40);
            chairLeg.setPrice(6.0);
            chairLeg.setPartId(1);
            chairLeg.setMinInv(1);
            chairLeg.setMaxInv(60);
            partRepository.save(chairLeg);

            InhousePart pChairBack = new InhousePart();
            pChairBack.setName("Plain Chair Back");
            pChairBack.setInv(12);
            pChairBack.setPrice(20.0);
            pChairBack.setPartId(2);
            pChairBack.setMinInv(1);
            pChairBack.setMaxInv(60);
            partRepository.save(pChairBack);

            OutsourcedPart fChairBack = new OutsourcedPart();
            fChairBack.setName("Fancy Chair Back");
            fChairBack.setInv(10);
            fChairBack.setPrice(25.0);
            fChairBack.setCompanyName("Fancy Company");
            fChairBack.setMinInv(1);
            fChairBack.setMaxInv(60);
            partRepository.save(fChairBack);


            InhousePart chairArm = new InhousePart();
            chairArm.setName("Chair Arm");
            chairArm.setInv(20);
            chairArm.setPrice(9.0);
            chairArm.setPartId(3);
            chairArm.setMinInv(1);
            chairArm.setMaxInv(60);
            partRepository.save(chairArm);

            InhousePart tableTop = new InhousePart();
            tableTop.setName("Table Top");
            tableTop.setInv(20);
            tableTop.setPrice(25.0);
            tableTop.setPartId(4);
            tableTop.setMinInv(1);
            tableTop.setMaxInv(60);
            partRepository.save(tableTop);

            InhousePart tableLeg = new InhousePart();
            tableLeg.setName("Table Leg");
            tableLeg.setInv(20);
            tableLeg.setPrice(30.0);
            tableLeg.setPartId(5);
            tableLeg.setMinInv(1);
            tableLeg.setMaxInv(60);
            partRepository.save(tableLeg);



        }


        if (productRepository.count()==0) {
            Product fChair= new Product("Fancy Chair",95.0,15);
            Product pChair = new Product("Plain Chair",65.0,20);
            productRepository.save(fChair);
            productRepository.save(pChair);

            Product fTableTop = new Product("Fancy Table Top",120.0,12);
            Product pTableTop = new Product("Plain Table Top",100.0,15);
            Product couch  = new Product("Couch",150.0,10);
            productRepository.save(fTableTop);
            productRepository.save(pTableTop);
            productRepository.save(couch);


        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

        }



    }

