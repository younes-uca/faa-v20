package com.ird.faa.ws.rest.provided.facade.admin;


import com.ird.faa.bean.DisciplineScientifique;
import com.ird.faa.bean.DisciplineScientifiqueErc;
import com.ird.faa.bean.KeyWord;
import com.ird.faa.service.admin.facade.KeyWordProviderAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("Test")
@RestController
@RequestMapping("api/admin/keyword-disiplineScientifique-assosiation")
public class KeyWordProviderRestAdmin {

    /// DisiplineScientifique
    @ApiOperation("All DisiplineScientifique exist")
    @GetMapping("/")
    public List<DisciplineScientifique> findAllDS() {
        return keyWordProviderAdminService.findAllDS();
    }


    /// DisiplineScientifiqueERC
    @ApiOperation("All DSErc DisiplineScientifiqueERC to a DisiplineScientifique")
    @GetMapping("/erc/{id}")
    public List<DisciplineScientifiqueErc> findAllDSErc(@PathVariable Long id) {
        return keyWordProviderAdminService.findAllDSErc(id);
    }

//     Keywords correspond to  DisiplineScientifique & DisiplineScientifiqueERC
    @ApiOperation("All Keyword associed to a DisiplineScientifiqueERC")
    @GetMapping("/keyword/{idErc}")
    public List<KeyWord> findKeyWords(@PathVariable Long idErc) {
        return keyWordProviderAdminService.findKeyWords(idErc);
    }

    @Autowired
    private KeyWordProviderAdminService keyWordProviderAdminService;
}
