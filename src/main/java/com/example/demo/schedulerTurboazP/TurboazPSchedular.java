package com.example.demo.schedulerTurboazP;

import com.example.demo.entity.TurboazPEntity;
import com.example.demo.repository.TurboazPriceRepository;
import lombok.AllArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@AllArgsConstructor
public class TurboazPSchedular {
    public final TurboazPriceRepository repository;

    @Scheduled(fixedRate = 5000)
    public void hello() throws IOException {
        Document doc = (Document) Jsoup.connect("https://turbo.az/").get();
        Elements elements = doc.getElementsByClass("product-price");
        String s = elements.get(0).html();

        String carPriceArray [] = s.split("<");

        Integer  price= Integer.parseInt(carPriceArray[0].replace(" ", ""));

        int limit = 15000;
        if (price > limit) {
            TurboazPEntity entity = new TurboazPEntity();

            entity.setDate(s);
            repository.save(entity);

        }


    }
}
