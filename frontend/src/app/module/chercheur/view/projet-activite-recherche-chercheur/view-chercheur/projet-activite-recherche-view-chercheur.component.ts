import {Component, OnInit} from '@angular/core';
import {ProjetActiviteRechercheService} from '../../../../../controller/service/ProjetActiviteRecherche.service';
import {ProjetActiviteRechercheVo} from '../../../../../controller/model/ProjetActiviteRecherche.model';
import {RoleService} from '../../../../../controller/service/role.service';
import {MessageService} from 'primeng/api';
import {Router} from '@angular/router';
import {MenuItem} from 'primeng/api';
import { environment } from 'src/environments/environment';
import {DatePipe} from '@angular/common';

import {EtatEtapeCampagneVo} from '../../../../../controller/model/EtatEtapeCampagne.model';
import {EtatEtapeCampagneService} from '../../../../../controller/service/EtatEtapeCampagne.service';
import {RoleProjetVo} from '../../../../../controller/model/RoleProjet.model';
import {RoleProjetService} from '../../../../../controller/service/RoleProjet.service';
import {StatusProjetVo} from '../../../../../controller/model/StatusProjet.model';
import {StatusProjetService} from '../../../../../controller/service/StatusProjet.service';
import {EtablissementVo} from '../../../../../controller/model/Etablissement.model';
import {EtablissementService} from '../../../../../controller/service/Etablissement.service';
import {ProjetActiviteRechercheDetailVo} from '../../../../../controller/model/ProjetActiviteRechercheDetail.model';
import {ProjetActiviteRechercheDetailService} from '../../../../../controller/service/ProjetActiviteRechercheDetail.service';
import {CampagneVo} from '../../../../../controller/model/Campagne.model';
import {CampagneService} from '../../../../../controller/service/Campagne.service';
import {PaysVo} from '../../../../../controller/model/Pays.model';
import {PaysService} from '../../../../../controller/service/Pays.service';
import {ChercheurVo} from '../../../../../controller/model/Chercheur.model';
import {ChercheurService} from '../../../../../controller/service/Chercheur.service';

@Component({
  selector: 'app-projet-activite-recherche-view-chercheur',
  templateUrl: './projet-activite-recherche-view-chercheur.component.html',
  styleUrls: ['./projet-activite-recherche-view-chercheur.component.css']
})
export class ProjetActiviteRechercheViewChercheurComponent implements OnInit {

        selectedProjetActiviteRechercheDetails: ProjetActiviteRechercheDetailVo = new ProjetActiviteRechercheDetailVo();
        projetActiviteRechercheDetailsListe: Array<ProjetActiviteRechercheDetailVo> = [];

        myStatusProjets: Array<StatusProjetVo> = [];
        myRoleProjets: Array<RoleProjetVo> = [];
        myEtablissements: Array<EtablissementVo> = [];
        myPayss: Array<PaysVo> = [];
        myEtatEtapeCampagnes: Array<EtatEtapeCampagneVo> = [];


constructor(private datePipe: DatePipe, private projetActiviteRechercheService: ProjetActiviteRechercheService
,private roleService:RoleService
,private messageService: MessageService
, private router: Router
    ,private etatEtapeCampagneService :EtatEtapeCampagneService
    ,private roleProjetService :RoleProjetService
    ,private statusProjetService :StatusProjetService
    ,private etablissementService :EtablissementService
    ,private projetActiviteRechercheDetailService :ProjetActiviteRechercheDetailService
    ,private campagneService :CampagneService
    ,private paysService :PaysService
    ,private chercheurService :ChercheurService
) {
}

// methods
ngOnInit(): void {
                this.selectedProjetActiviteRechercheDetails.statusProjetVo = new StatusProjetVo();
                this.statusProjetService.findAll().subscribe((data) => this.statusProjets = data);
                this.selectedProjetActiviteRechercheDetails.roleProjetVo = new RoleProjetVo();
                this.roleProjetService.findAll().subscribe((data) => this.roleProjets = data);
                this.selectedProjetActiviteRechercheDetails.etablissementVo = new EtablissementVo();
                this.etablissementService.findAll().subscribe((data) => this.etablissements = data);
                this.selectedProjetActiviteRechercheDetails.paysVo = new PaysVo();
                this.paysService.findAll().subscribe((data) => this.payss = data);
                this.selectedProjetActiviteRechercheDetails.etatEtapeCampagneVo = new EtatEtapeCampagneVo();
                this.etatEtapeCampagneService.findAll().subscribe((data) => this.etatEtapeCampagnes = data);
    this.selectedEtatEtapeCampagne = new EtatEtapeCampagneVo();
    this.etatEtapeCampagneService.findAll().subscribe((data) => this.etatEtapeCampagnes = data);
    this.selectedChercheur = new ChercheurVo();
    this.chercheurService.findAll().subscribe((data) => this.chercheurs = data);
    this.selectedCampagne = new CampagneVo();
    this.campagneService.findAll().subscribe((data) => this.campagnes = data);
}

hideViewDialog(){
    this.viewProjetActiviteRechercheDialog  = false;
}

// getters and setters

get projetActiviteRecherches(): Array<ProjetActiviteRechercheVo> {
    return this.projetActiviteRechercheService.projetActiviteRecherches;
       }
set projetActiviteRecherches(value: Array<ProjetActiviteRechercheVo>) {
        this.projetActiviteRechercheService.projetActiviteRecherches = value;
       }

 get selectedProjetActiviteRecherche():ProjetActiviteRechercheVo {
           return this.projetActiviteRechercheService.selectedProjetActiviteRecherche;
       }
    set selectedProjetActiviteRecherche(value: ProjetActiviteRechercheVo) {
        this.projetActiviteRechercheService.selectedProjetActiviteRecherche = value;
       }

   get viewProjetActiviteRechercheDialog():boolean {
           return this.projetActiviteRechercheService.viewProjetActiviteRechercheDialog;

       }
    set viewProjetActiviteRechercheDialog(value: boolean) {
        this.projetActiviteRechercheService.viewProjetActiviteRechercheDialog= value;
       }

       get selectedEtablissement():EtablissementVo {
           return this.etablissementService.selectedEtablissement;
       }
      set selectedEtablissement(value: EtablissementVo) {
        this.etablissementService.selectedEtablissement = value;
       }
       get etablissements():Array<EtablissementVo> {
           return this.etablissementService.etablissements;
       }
       set etablissements(value: Array<EtablissementVo>) {
        this.etablissementService.etablissements = value;
       }
       get editEtablissementDialog():boolean {
           return this.etablissementService.editEtablissementDialog;
       }
      set editEtablissementDialog(value: boolean) {
        this.etablissementService.editEtablissementDialog= value;
       }
       get selectedRoleProjet():RoleProjetVo {
           return this.roleProjetService.selectedRoleProjet;
       }
      set selectedRoleProjet(value: RoleProjetVo) {
        this.roleProjetService.selectedRoleProjet = value;
       }
       get roleProjets():Array<RoleProjetVo> {
           return this.roleProjetService.roleProjets;
       }
       set roleProjets(value: Array<RoleProjetVo>) {
        this.roleProjetService.roleProjets = value;
       }
       get editRoleProjetDialog():boolean {
           return this.roleProjetService.editRoleProjetDialog;
       }
      set editRoleProjetDialog(value: boolean) {
        this.roleProjetService.editRoleProjetDialog= value;
       }
       get selectedStatusProjet():StatusProjetVo {
           return this.statusProjetService.selectedStatusProjet;
       }
      set selectedStatusProjet(value: StatusProjetVo) {
        this.statusProjetService.selectedStatusProjet = value;
       }
       get statusProjets():Array<StatusProjetVo> {
           return this.statusProjetService.statusProjets;
       }
       set statusProjets(value: Array<StatusProjetVo>) {
        this.statusProjetService.statusProjets = value;
       }
       get editStatusProjetDialog():boolean {
           return this.statusProjetService.editStatusProjetDialog;
       }
      set editStatusProjetDialog(value: boolean) {
        this.statusProjetService.editStatusProjetDialog= value;
       }
       get selectedCampagne():CampagneVo {
           return this.campagneService.selectedCampagne;
       }
      set selectedCampagne(value: CampagneVo) {
        this.campagneService.selectedCampagne = value;
       }
       get campagnes():Array<CampagneVo> {
           return this.campagneService.campagnes;
       }
       set campagnes(value: Array<CampagneVo>) {
        this.campagneService.campagnes = value;
       }
       get editCampagneDialog():boolean {
           return this.campagneService.editCampagneDialog;
       }
      set editCampagneDialog(value: boolean) {
        this.campagneService.editCampagneDialog= value;
       }
       get selectedEtatEtapeCampagne():EtatEtapeCampagneVo {
           return this.etatEtapeCampagneService.selectedEtatEtapeCampagne;
       }
      set selectedEtatEtapeCampagne(value: EtatEtapeCampagneVo) {
        this.etatEtapeCampagneService.selectedEtatEtapeCampagne = value;
       }
       get etatEtapeCampagnes():Array<EtatEtapeCampagneVo> {
           return this.etatEtapeCampagneService.etatEtapeCampagnes;
       }
       set etatEtapeCampagnes(value: Array<EtatEtapeCampagneVo>) {
        this.etatEtapeCampagneService.etatEtapeCampagnes = value;
       }
       get editEtatEtapeCampagneDialog():boolean {
           return this.etatEtapeCampagneService.editEtatEtapeCampagneDialog;
       }
      set editEtatEtapeCampagneDialog(value: boolean) {
        this.etatEtapeCampagneService.editEtatEtapeCampagneDialog= value;
       }
       get selectedChercheur():ChercheurVo {
           return this.chercheurService.selectedChercheur;
       }
      set selectedChercheur(value: ChercheurVo) {
        this.chercheurService.selectedChercheur = value;
       }
       get chercheurs():Array<ChercheurVo> {
           return this.chercheurService.chercheurs;
       }
       set chercheurs(value: Array<ChercheurVo>) {
        this.chercheurService.chercheurs = value;
       }
       get editChercheurDialog():boolean {
           return this.chercheurService.editChercheurDialog;
       }
      set editChercheurDialog(value: boolean) {
        this.chercheurService.editChercheurDialog= value;
       }
       get selectedPays():PaysVo {
           return this.paysService.selectedPays;
       }
      set selectedPays(value: PaysVo) {
        this.paysService.selectedPays = value;
       }
       get payss():Array<PaysVo> {
           return this.paysService.payss;
       }
       set payss(value: Array<PaysVo>) {
        this.paysService.payss = value;
       }
       get editPaysDialog():boolean {
           return this.paysService.editPaysDialog;
       }
      set editPaysDialog(value: boolean) {
        this.paysService.editPaysDialog= value;
       }

    get dateFormat(){
            return environment.dateFormatView;
    }

    get dateFormatColumn(){
            return environment.dateFormatList;
     }
}
