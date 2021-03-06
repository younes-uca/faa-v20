import {Component, OnInit} from '@angular/core';
import {CultureScientifiqueService} from '../../../../../controller/service/CultureScientifique.service';
import {CultureScientifiqueVo} from '../../../../../controller/model/CultureScientifique.model';
import {RoleService} from '../../../../../controller/service/role.service';
import {MessageService} from 'primeng/api';
import {Router} from '@angular/router';
import {MenuItem} from 'primeng/api';
import { environment } from 'src/environments/environment';
import {DateUtils} from '../../../../../utils/DateUtils';
import {DatePipe} from '@angular/common';

import {EtatEtapeCampagneVo} from '../../../../../controller/model/EtatEtapeCampagne.model';
import {EtatEtapeCampagneService} from '../../../../../controller/service/EtatEtapeCampagne.service';
import {OutilPedagogiqueVo} from '../../../../../controller/model/OutilPedagogique.model';
import {OutilPedagogiqueService} from '../../../../../controller/service/OutilPedagogique.service';
import {RencontreGrandPubliqueJeunePubliqueVo} from '../../../../../controller/model/RencontreGrandPubliqueJeunePublique.model';
import {RencontreGrandPubliqueJeunePubliqueService} from '../../../../../controller/service/RencontreGrandPubliqueJeunePublique.service';
import {RencontreMediaVo} from '../../../../../controller/model/RencontreMedia.model';
import {RencontreMediaService} from '../../../../../controller/service/RencontreMedia.service';
import {FormatRencontreVo} from '../../../../../controller/model/FormatRencontre.model';
import {FormatRencontreService} from '../../../../../controller/service/FormatRencontre.service';
import {NatureActiviteGrandPubliqueVo} from '../../../../../controller/model/NatureActiviteGrandPublique.model';
import {NatureActiviteGrandPubliqueService} from '../../../../../controller/service/NatureActiviteGrandPublique.service';
import {ContexteVo} from '../../../../../controller/model/Contexte.model';
import {ContexteService} from '../../../../../controller/service/Contexte.service';
import {CampagneVo} from '../../../../../controller/model/Campagne.model';
import {CampagneService} from '../../../../../controller/service/Campagne.service';
import {PaysVo} from '../../../../../controller/model/Pays.model';
import {PaysService} from '../../../../../controller/service/Pays.service';
import {ChercheurVo} from '../../../../../controller/model/Chercheur.model';
import {ChercheurService} from '../../../../../controller/service/Chercheur.service';

@Component({
  selector: 'app-culture-scientifique-edit-admin',
  templateUrl: './culture-scientifique-edit-admin.component.html',
  styleUrls: ['./culture-scientifique-edit-admin.component.css']
})
export class CultureScientifiqueEditAdminComponent implements OnInit {

        selectedRencontreGrandPubliqueJeunePubliques: RencontreGrandPubliqueJeunePubliqueVo = new RencontreGrandPubliqueJeunePubliqueVo();
        rencontreGrandPubliqueJeunePubliquesListe: Array<RencontreGrandPubliqueJeunePubliqueVo> = [];

        myFormatRencontres: Array<FormatRencontreVo> = [];
        myContextes: Array<ContexteVo> = [];
        myPayss: Array<PaysVo> = [];
        myEtatEtapeCampagnes: Array<EtatEtapeCampagneVo> = [];

        selectedRencontreMedias: RencontreMediaVo = new RencontreMediaVo();
        rencontreMediasListe: Array<RencontreMediaVo> = [];


        selectedOutilPedagogiques: OutilPedagogiqueVo = new OutilPedagogiqueVo();
        outilPedagogiquesListe: Array<OutilPedagogiqueVo> = [];



constructor(private datePipe: DatePipe, private cultureScientifiqueService: CultureScientifiqueService
 ,       private roleService:RoleService
 ,       private messageService: MessageService
 ,       private router: Router
 ,       private etatEtapeCampagneService: EtatEtapeCampagneService
 ,       private outilPedagogiqueService: OutilPedagogiqueService
 ,       private rencontreGrandPubliqueJeunePubliqueService: RencontreGrandPubliqueJeunePubliqueService
 ,       private rencontreMediaService: RencontreMediaService
 ,       private formatRencontreService: FormatRencontreService
 ,       private natureActiviteGrandPubliqueService: NatureActiviteGrandPubliqueService
 ,       private contexteService: ContexteService
 ,       private campagneService: CampagneService
 ,       private paysService: PaysService
 ,       private chercheurService: ChercheurService
) {
}

// methods
ngOnInit(): void {
                this.selectedRencontreGrandPubliqueJeunePubliques.formatRencontreVo = new FormatRencontreVo();
                this.formatRencontreService.findAll().subscribe((data) => this.formatRencontres = data);
                this.selectedRencontreGrandPubliqueJeunePubliques.contexteVo = new ContexteVo();
                this.contexteService.findAll().subscribe((data) => this.contextes = data);
                this.selectedRencontreGrandPubliqueJeunePubliques.paysVo = new PaysVo();
                this.paysService.findAll().subscribe((data) => this.payss = data);
                this.selectedRencontreGrandPubliqueJeunePubliques.etatEtapeCampagneVo = new EtatEtapeCampagneVo();
                this.etatEtapeCampagneService.findAll().subscribe((data) => this.etatEtapeCampagnes = data);
                this.selectedRencontreMedias.formatRencontreVo = new FormatRencontreVo();
                this.formatRencontreService.findAll().subscribe((data) => this.formatRencontres = data);
                this.selectedRencontreMedias.etatEtapeCampagneVo = new EtatEtapeCampagneVo();
                this.etatEtapeCampagneService.findAll().subscribe((data) => this.etatEtapeCampagnes = data);
                this.selectedOutilPedagogiques.etatEtapeCampagneVo = new EtatEtapeCampagneVo();
                this.etatEtapeCampagneService.findAll().subscribe((data) => this.etatEtapeCampagnes = data);
    this.selectedCampagne = new CampagneVo();
    this.campagneService.findAll().subscribe((data) => this.campagnes = data);
    this.selectedChercheur = new ChercheurVo();
    this.chercheurService.findAll().subscribe((data) => this.chercheurs = data);
    this.selectedEtatEtapeCampagne = new EtatEtapeCampagneVo();
    this.etatEtapeCampagneService.findAll().subscribe((data) => this.etatEtapeCampagnes = data);
    this.selectedNatureActiviteGrandPublique = new NatureActiviteGrandPubliqueVo();
    this.natureActiviteGrandPubliqueService.findAll().subscribe((data) => this.natureActiviteGrandPubliques = data);
}
        addRencontreGrandPubliqueJeunePubliques() {
        if( this.selectedCultureScientifique.rencontreGrandPubliqueJeunePubliquesVo == null ){
            this.selectedCultureScientifique.rencontreGrandPubliqueJeunePubliquesVo = new Array<RencontreGrandPubliqueJeunePubliqueVo>();
        }
        this.selectedCultureScientifique.rencontreGrandPubliqueJeunePubliquesVo.push(this.selectedRencontreGrandPubliqueJeunePubliques);
        this.selectedRencontreGrandPubliqueJeunePubliques = new RencontreGrandPubliqueJeunePubliqueVo();
        }

       deleteRencontreGrandPubliqueJeunePubliques(p: RencontreGrandPubliqueJeunePubliqueVo) {
        this.selectedCultureScientifique.rencontreGrandPubliqueJeunePubliquesVo.forEach((element, index) => {
            if (element === p) { this.selectedCultureScientifique.rencontreGrandPubliqueJeunePubliquesVo.splice(index, 1); }
        });
    }
        addRencontreMedias() {
        if( this.selectedCultureScientifique.rencontreMediasVo == null ){
            this.selectedCultureScientifique.rencontreMediasVo = new Array<RencontreMediaVo>();
        }
        this.selectedCultureScientifique.rencontreMediasVo.push(this.selectedRencontreMedias);
        this.selectedRencontreMedias = new RencontreMediaVo();
        }

       deleteRencontreMedias(p: RencontreMediaVo) {
        this.selectedCultureScientifique.rencontreMediasVo.forEach((element, index) => {
            if (element === p) { this.selectedCultureScientifique.rencontreMediasVo.splice(index, 1); }
        });
    }
        addOutilPedagogiques() {
        if( this.selectedCultureScientifique.outilPedagogiquesVo == null ){
            this.selectedCultureScientifique.outilPedagogiquesVo = new Array<OutilPedagogiqueVo>();
        }
        this.selectedCultureScientifique.outilPedagogiquesVo.push(this.selectedOutilPedagogiques);
        this.selectedOutilPedagogiques = new OutilPedagogiqueVo();
        }

       deleteOutilPedagogiques(p: OutilPedagogiqueVo) {
        this.selectedCultureScientifique.outilPedagogiquesVo.forEach((element, index) => {
            if (element === p) { this.selectedCultureScientifique.outilPedagogiquesVo.splice(index, 1); }
        });
    }

public edit(){
this.editWithShowOption(false);
}
public editWithShowOption(showList: boolean){
    this.cultureScientifiqueService.edit().subscribe(cultureScientifique=>{
    const myIndex = this.cultureScientifiques.findIndex(e => e.id === this.selectedCultureScientifique.id);
    this.cultureScientifiques[myIndex] = this.selectedCultureScientifique;
    this.editCultureScientifiqueDialog = false;
    this.selectedCultureScientifique = new CultureScientifiqueVo();


    }, error => {
        console.log(error);
    });

}

              public async openCreatenatureActiviteGrandPublique(natureActiviteGrandPublique: string) {
                      const isPermistted = await this.roleService.isPermitted('NatureActiviteGrandPublique', 'add');
                       if(isPermistted){
         this.selectedNatureActiviteGrandPublique = new NatureActiviteGrandPubliqueVo();
        this.createNatureActiviteGrandPubliqueDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'probl??me de permission'
            });
        }
}
              public async openCreateformatRencontre(formatRencontre: string) {
                      const isPermistted = await this.roleService.isPermitted('FormatRencontre', 'add');
                       if(isPermistted){
         this.selectedFormatRencontre = new FormatRencontreVo();
        this.createFormatRencontreDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'probl??me de permission'
            });
        }
}
              public async openCreatecampagne(campagne: string) {
                      const isPermistted = await this.roleService.isPermitted('Campagne', 'add');
                       if(isPermistted){
         this.selectedCampagne = new CampagneVo();
        this.createCampagneDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'probl??me de permission'
            });
        }
}
              public async openCreatecontexte(contexte: string) {
                      const isPermistted = await this.roleService.isPermitted('Contexte', 'add');
                       if(isPermistted){
         this.selectedContexte = new ContexteVo();
        this.createContexteDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'probl??me de permission'
            });
        }
}
              public async openCreatechercheur(chercheur: string) {
                      const isPermistted = await this.roleService.isPermitted('Chercheur', 'add');
                       if(isPermistted){
         this.selectedChercheur = new ChercheurVo();
        this.createChercheurDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'probl??me de permission'
            });
        }
}
              public async openCreateetatEtapeCampagne(etatEtapeCampagne: string) {
                      const isPermistted = await this.roleService.isPermitted('EtatEtapeCampagne', 'add');
                       if(isPermistted){
         this.selectedEtatEtapeCampagne = new EtatEtapeCampagneVo();
        this.createEtatEtapeCampagneDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'probl??me de permission'
            });
        }
}
              public async openCreatepays(pays: string) {
                      const isPermistted = await this.roleService.isPermitted('Pays', 'add');
                       if(isPermistted){
         this.selectedPays = new PaysVo();
        this.createPaysDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'probl??me de permission'
            });
        }
}
// methods

hideEditDialog(){
    this.editCultureScientifiqueDialog  = false;
}

// getters and setters

get cultureScientifiques(): Array<CultureScientifiqueVo> {
    return this.cultureScientifiqueService.cultureScientifiques;
       }
set cultureScientifiques(value: Array<CultureScientifiqueVo>) {
        this.cultureScientifiqueService.cultureScientifiques = value;
       }

 get selectedCultureScientifique(): CultureScientifiqueVo {
           return this.cultureScientifiqueService.selectedCultureScientifique;
       }
    set selectedCultureScientifique(value: CultureScientifiqueVo) {
        this.cultureScientifiqueService.selectedCultureScientifique = value;
       }

   get editCultureScientifiqueDialog(): boolean {
           return this.cultureScientifiqueService.editCultureScientifiqueDialog;

       }
    set editCultureScientifiqueDialog(value: boolean) {
        this.cultureScientifiqueService.editCultureScientifiqueDialog = value;
       }

       get selectedNatureActiviteGrandPublique(): NatureActiviteGrandPubliqueVo {
           return this.natureActiviteGrandPubliqueService.selectedNatureActiviteGrandPublique;
       }
      set selectedNatureActiviteGrandPublique(value: NatureActiviteGrandPubliqueVo) {
        this.natureActiviteGrandPubliqueService.selectedNatureActiviteGrandPublique = value;
       }
       get natureActiviteGrandPubliques(): Array<NatureActiviteGrandPubliqueVo> {
           return this.natureActiviteGrandPubliqueService.natureActiviteGrandPubliques;
       }
       set natureActiviteGrandPubliques(value: Array<NatureActiviteGrandPubliqueVo>) {
        this.natureActiviteGrandPubliqueService.natureActiviteGrandPubliques = value;
       }
       get createNatureActiviteGrandPubliqueDialog(): boolean {
           return this.natureActiviteGrandPubliqueService.createNatureActiviteGrandPubliqueDialog;
       }
      set createNatureActiviteGrandPubliqueDialog(value: boolean) {
        this.natureActiviteGrandPubliqueService.createNatureActiviteGrandPubliqueDialog= value;
       }
       get selectedFormatRencontre(): FormatRencontreVo {
           return this.formatRencontreService.selectedFormatRencontre;
       }
      set selectedFormatRencontre(value: FormatRencontreVo) {
        this.formatRencontreService.selectedFormatRencontre = value;
       }
       get formatRencontres(): Array<FormatRencontreVo> {
           return this.formatRencontreService.formatRencontres;
       }
       set formatRencontres(value: Array<FormatRencontreVo>) {
        this.formatRencontreService.formatRencontres = value;
       }
       get createFormatRencontreDialog(): boolean {
           return this.formatRencontreService.createFormatRencontreDialog;
       }
      set createFormatRencontreDialog(value: boolean) {
        this.formatRencontreService.createFormatRencontreDialog= value;
       }
       get selectedCampagne(): CampagneVo {
           return this.campagneService.selectedCampagne;
       }
      set selectedCampagne(value: CampagneVo) {
        this.campagneService.selectedCampagne = value;
       }
       get campagnes(): Array<CampagneVo> {
           return this.campagneService.campagnes;
       }
       set campagnes(value: Array<CampagneVo>) {
        this.campagneService.campagnes = value;
       }
       get createCampagneDialog(): boolean {
           return this.campagneService.createCampagneDialog;
       }
      set createCampagneDialog(value: boolean) {
        this.campagneService.createCampagneDialog= value;
       }
       get selectedContexte(): ContexteVo {
           return this.contexteService.selectedContexte;
       }
      set selectedContexte(value: ContexteVo) {
        this.contexteService.selectedContexte = value;
       }
       get contextes(): Array<ContexteVo> {
           return this.contexteService.contextes;
       }
       set contextes(value: Array<ContexteVo>) {
        this.contexteService.contextes = value;
       }
       get createContexteDialog(): boolean {
           return this.contexteService.createContexteDialog;
       }
      set createContexteDialog(value: boolean) {
        this.contexteService.createContexteDialog= value;
       }
       get selectedChercheur(): ChercheurVo {
           return this.chercheurService.selectedChercheur;
       }
      set selectedChercheur(value: ChercheurVo) {
        this.chercheurService.selectedChercheur = value;
       }
       get chercheurs(): Array<ChercheurVo> {
           return this.chercheurService.chercheurs;
       }
       set chercheurs(value: Array<ChercheurVo>) {
        this.chercheurService.chercheurs = value;
       }
       get createChercheurDialog(): boolean {
           return this.chercheurService.createChercheurDialog;
       }
      set createChercheurDialog(value: boolean) {
        this.chercheurService.createChercheurDialog= value;
       }
       get selectedEtatEtapeCampagne(): EtatEtapeCampagneVo {
           return this.etatEtapeCampagneService.selectedEtatEtapeCampagne;
       }
      set selectedEtatEtapeCampagne(value: EtatEtapeCampagneVo) {
        this.etatEtapeCampagneService.selectedEtatEtapeCampagne = value;
       }
       get etatEtapeCampagnes(): Array<EtatEtapeCampagneVo> {
           return this.etatEtapeCampagneService.etatEtapeCampagnes;
       }
       set etatEtapeCampagnes(value: Array<EtatEtapeCampagneVo>) {
        this.etatEtapeCampagneService.etatEtapeCampagnes = value;
       }
       get createEtatEtapeCampagneDialog(): boolean {
           return this.etatEtapeCampagneService.createEtatEtapeCampagneDialog;
       }
      set createEtatEtapeCampagneDialog(value: boolean) {
        this.etatEtapeCampagneService.createEtatEtapeCampagneDialog= value;
       }
       get selectedPays(): PaysVo {
           return this.paysService.selectedPays;
       }
      set selectedPays(value: PaysVo) {
        this.paysService.selectedPays = value;
       }
       get payss(): Array<PaysVo> {
           return this.paysService.payss;
       }
       set payss(value: Array<PaysVo>) {
        this.paysService.payss = value;
       }
       get createPaysDialog(): boolean {
           return this.paysService.createPaysDialog;
       }
      set createPaysDialog(value: boolean) {
        this.paysService.createPaysDialog= value;
       }

    get dateFormat(){
            return environment.dateFormatEdit;
    }

    get dateFormatColumn(){
            return environment.dateFormatList;
     }
}
