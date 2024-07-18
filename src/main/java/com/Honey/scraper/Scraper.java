package com.Honey.scraper;

import com.Honey.model.Company;
import com.Honey.model.ScrapedResult;

public interface Scraper {
    Company scrapCompanyByTicker(String ticker);

    ScrapedResult scrap(Company company);
}
