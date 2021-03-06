import {Component, OnInit} from '@angular/core';
import {DisciplineScientifiqueErcParentService} from '../../../../../controller/service/DisciplineScientifiqueErcParent.service';
import {DisciplineScientifiqueErcParentVo} from '../../../../../controller/model/DisciplineScientifiqueErcParent.model';
import * as moment from 'moment';
import {Router} from '@angular/router';
import { environment } from 'src/environments/environment';
import jsPDF from 'jspdf';
import autoTable, { RowInput } from 'jspdf-autotable';
import { saveAs } from 'file-saver';
import { RoleService } from '../../../../../controller/service/role.service';
import {DatePipe} from '@angular/common';


import { MessageService, ConfirmationService, MenuItem } from 'primeng/api';
import {AuthService} from '../../../../../controller/service/Auth.service';
import { ExportService } from '../../../../../controller/service/Export.service';

@Component({
  selector: 'app-discipline-scientifique-erc-parent-list-chercheur',
  templateUrl: './discipline-scientifique-erc-parent-list-chercheur.component.html',
  styleUrls: ['./discipline-scientifique-erc-parent-list-chercheur.component.css']
})
export class DisciplineScientifiqueErcParentListChercheurComponent implements OnInit {
   // declarations
    findByCriteriaShow:boolean=false;
    cols: any[] = [];
    excelPdfButons: MenuItem[];
    exportData: any[] = [];
    criteriaData: any[] = [];
    fileName = 'DisciplineScientifiqueErcParent';
     yesOrNoArchive :any[] =[];
     yesOrNoAdmin :any[] =[];
     yesOrNoVisible :any[] =[];


    constructor(private datePipe: DatePipe, private disciplineScientifiqueErcParentService: DisciplineScientifiqueErcParentService,private messageService: MessageService,private confirmationService: ConfirmationService,private roleService:RoleService, private router: Router , private authService: AuthService , private exportService: ExportService

) { }

    ngOnInit(): void {
      this.loadDisciplineScientifiqueErcParents();
      this.initExport();
      this.initCol();
    this.yesOrNoArchive =  [{label: 'Archive', value: null},{label: 'Oui', value: 1},{label: 'Non', value: 0}];
    this.yesOrNoAdmin =  [{label: 'Admin', value: null},{label: 'Oui', value: 1},{label: 'Non', value: 0}];
    this.yesOrNoVisible =  [{label: 'Visible', value: null},{label: 'Oui', value: 1},{label: 'Non', value: 0}];
    }
    
    // methods
      public async loadDisciplineScientifiqueErcParents(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('DisciplineScientifiqueErcParent', 'list');
        isPermistted ? this.disciplineScientifiqueErcParentService.findAll().subscribe(disciplineScientifiqueErcParents => this.disciplineScientifiqueErcParents = disciplineScientifiqueErcParents,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'probl??me d\'autorisation'});
    }


  public searchRequest(){
        this.disciplineScientifiqueErcParentService.findByCriteria(this.searchDisciplineScientifiqueErcParent).subscribe(disciplineScientifiqueErcParents=>{
            
            this.disciplineScientifiqueErcParents = disciplineScientifiqueErcParents;
           // this.searchDisciplineScientifiqueErcParent = new DisciplineScientifiqueErcParentVo();
        },error=>console.log(error));
    }

    private initCol() {
        this.cols = [
                            {field: 'libelleFr', header: 'Libelle fr'},
                            {field: 'libelleEng', header: 'Libelle eng'},
                            {field: 'code', header: 'Code'},
                            {field: 'niveau', header: 'Niveau'},
                            {field: 'archive', header: 'Archive'},
                            {field: 'dateArchivage', header: 'Date archivage'},
                            {field: 'dateCreation', header: 'Date creation'},
                            {field: 'admin', header: 'Admin'},
                            {field: 'visible', header: 'Visible'},
                            {field: 'username', header: 'Username'},
        ];
    }
    
    public async editDisciplineScientifiqueErcParent(disciplineScientifiqueErcParent:DisciplineScientifiqueErcParentVo){
        const isPermistted = await this.roleService.isPermitted('DisciplineScientifiqueErcParent', 'edit');
         if(isPermistted){
          this.disciplineScientifiqueErcParentService.findByIdWithAssociatedList(disciplineScientifiqueErcParent).subscribe(res => {
           this.selectedDisciplineScientifiqueErcParent = res;
            this.selectedDisciplineScientifiqueErcParent.dateArchivage = new Date(disciplineScientifiqueErcParent.dateArchivage);
            this.selectedDisciplineScientifiqueErcParent.dateCreation = new Date(disciplineScientifiqueErcParent.dateCreation);
            this.editDisciplineScientifiqueErcParentDialog = true;
          });
        }else{
            this.messageService.add({
                severity: 'error', summary: 'Erreur', detail: 'Probl??me de permission'
            });
         }
       
    }
    


   public async viewDisciplineScientifiqueErcParent(disciplineScientifiqueErcParent:DisciplineScientifiqueErcParentVo){
        const isPermistted = await this.roleService.isPermitted('DisciplineScientifiqueErcParent', 'view');
        if(isPermistted){
           this.disciplineScientifiqueErcParentService.findByIdWithAssociatedList(disciplineScientifiqueErcParent).subscribe(res => {
           this.selectedDisciplineScientifiqueErcParent = res;
            this.selectedDisciplineScientifiqueErcParent.dateArchivage = new Date(disciplineScientifiqueErcParent.dateArchivage);
            this.selectedDisciplineScientifiqueErcParent.dateCreation = new Date(disciplineScientifiqueErcParent.dateCreation);
            this.viewDisciplineScientifiqueErcParentDialog = true;
          });
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'probl??me d\'autorisation'
            });
        }
        
    }
    
    public async openCreateDisciplineScientifiqueErcParent(pojo: string) {
        const isPermistted = await this.roleService.isPermitted(pojo, 'add');
        if(isPermistted){
         this.selectedDisciplineScientifiqueErcParent = new DisciplineScientifiqueErcParentVo();
            this.createDisciplineScientifiqueErcParentDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'probl??me d\'autorisation'
            });
        }
       
    }


    public async deleteDisciplineScientifiqueErcParent(disciplineScientifiqueErcParent:DisciplineScientifiqueErcParentVo){
       const isPermistted = await this.roleService.isPermitted('DisciplineScientifiqueErcParent', 'delete');
        if(isPermistted){
                      this.confirmationService.confirm({
                      message: 'Voulez-vous supprimer cet ??l??ment (Discipline scientifique erc parent) ?',
                      header: 'Confirmation',
                      icon: 'pi pi-exclamation-triangle',
                      accept: () => {
                          this.disciplineScientifiqueErcParentService.delete(disciplineScientifiqueErcParent).subscribe(status=>{
                          if(status > 0){
                          const position = this.disciplineScientifiqueErcParents.indexOf(disciplineScientifiqueErcParent);
                          position > -1 ? this.disciplineScientifiqueErcParents.splice(position, 1) : false;
                       this.messageService.add({
                        severity: 'success',
                        summary: 'Succ??s',
                        detail: 'Discipline scientifique erc parent Supprim??',
                        life: 3000
                    });
                                     }

                    },error=>console.log(error))
                             }
                     });
              }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'Probl??me de permission'
              });
             }
    }


public async duplicateDisciplineScientifiqueErcParent(disciplineScientifiqueErcParent: DisciplineScientifiqueErcParentVo) {

     this.disciplineScientifiqueErcParentService.findByIdWithAssociatedList(disciplineScientifiqueErcParent).subscribe(
	 res => {
	       this.initDuplicateDisciplineScientifiqueErcParent(res);
	       this.selectedDisciplineScientifiqueErcParent = res;
	       this.selectedDisciplineScientifiqueErcParent.id = null;
            this.createDisciplineScientifiqueErcParentDialog = true;

});

	}

	initDuplicateDisciplineScientifiqueErcParent(res: DisciplineScientifiqueErcParentVo) {


	}

  initExport(): void {
    this.excelPdfButons = [
      {label: 'CSV', icon: 'pi pi-file', command: () => {this.prepareColumnExport();this.exportService.exportCSV(this.criteriaData,this.exportData,this.fileName);}},
      {label: 'XLS', icon: 'pi pi-file-excel', command: () => {this.prepareColumnExport();this.exportService.exportExcel(this.criteriaData,this.exportData,this.fileName);}},
      {label: 'PDF', icon: 'pi pi-file-pdf', command: () => {this.prepareColumnExport();this.exportService.exportPdf(this.criteriaData,this.exportData,this.fileName);}}
   ];
  }


    prepareColumnExport(): void {
    this.exportData = this.disciplineScientifiqueErcParents.map(e => {
    return {
                    'Libelle fr': e.libelleFr ,
                    'Libelle eng': e.libelleEng ,
                    'Code': e.code ,
                    'Niveau': e.niveau ,
                    'Archive': e.archive? 'Vrai' : 'Faux' ,
                    'Date archivage': this.datePipe.transform(e.dateArchivage , 'dd-MM-yyyy'),
                    'Date creation': this.datePipe.transform(e.dateCreation , 'dd-MM-yyyy'),
                    'Admin': e.admin? 'Vrai' : 'Faux' ,
                    'Visible': e.visible? 'Vrai' : 'Faux' ,
                    'Username': e.username ,
     }
      });

      this.criteriaData = [{
            'Libelle fr': this.searchDisciplineScientifiqueErcParent.libelleFr ? this.searchDisciplineScientifiqueErcParent.libelleFr : environment.emptyForExport ,
            'Libelle eng': this.searchDisciplineScientifiqueErcParent.libelleEng ? this.searchDisciplineScientifiqueErcParent.libelleEng : environment.emptyForExport ,
            'Code': this.searchDisciplineScientifiqueErcParent.code ? this.searchDisciplineScientifiqueErcParent.code : environment.emptyForExport ,
            'Niveau Min': this.searchDisciplineScientifiqueErcParent.niveauMin ? this.searchDisciplineScientifiqueErcParent.niveauMin : environment.emptyForExport ,
            'Niveau Max': this.searchDisciplineScientifiqueErcParent.niveauMax ? this.searchDisciplineScientifiqueErcParent.niveauMax : environment.emptyForExport ,
            'Archive': this.searchDisciplineScientifiqueErcParent.archive ? (this.searchDisciplineScientifiqueErcParent.archive ? environment.trueValue : environment.falseValue) : environment.emptyForExport ,
            'Date archivage Min': this.searchDisciplineScientifiqueErcParent.dateArchivageMin ? this.datePipe.transform(this.searchDisciplineScientifiqueErcParent.dateArchivageMin , this.dateFormat) : environment.emptyForExport ,
            'Date archivage Max': this.searchDisciplineScientifiqueErcParent.dateArchivageMax ? this.datePipe.transform(this.searchDisciplineScientifiqueErcParent.dateArchivageMax , this.dateFormat) : environment.emptyForExport ,
            'Date creation Min': this.searchDisciplineScientifiqueErcParent.dateCreationMin ? this.datePipe.transform(this.searchDisciplineScientifiqueErcParent.dateCreationMin , this.dateFormat) : environment.emptyForExport ,
            'Date creation Max': this.searchDisciplineScientifiqueErcParent.dateCreationMax ? this.datePipe.transform(this.searchDisciplineScientifiqueErcParent.dateCreationMax , this.dateFormat) : environment.emptyForExport ,
            'Admin': this.searchDisciplineScientifiqueErcParent.admin ? (this.searchDisciplineScientifiqueErcParent.admin ? environment.trueValue : environment.falseValue) : environment.emptyForExport ,
            'Visible': this.searchDisciplineScientifiqueErcParent.visible ? (this.searchDisciplineScientifiqueErcParent.visible ? environment.trueValue : environment.falseValue) : environment.emptyForExport ,
            'Username': this.searchDisciplineScientifiqueErcParent.username ? this.searchDisciplineScientifiqueErcParent.username : environment.emptyForExport ,
     }];

      }

    // getters and setters

    get disciplineScientifiqueErcParents(): Array<DisciplineScientifiqueErcParentVo> {
           return this.disciplineScientifiqueErcParentService.disciplineScientifiqueErcParents;
       }
    set disciplineScientifiqueErcParents(value: Array<DisciplineScientifiqueErcParentVo>) {
        this.disciplineScientifiqueErcParentService.disciplineScientifiqueErcParents = value;
       }

    get disciplineScientifiqueErcParentSelections(): Array<DisciplineScientifiqueErcParentVo> {
           return this.disciplineScientifiqueErcParentService.disciplineScientifiqueErcParentSelections;
       }
    set disciplineScientifiqueErcParentSelections(value: Array<DisciplineScientifiqueErcParentVo>) {
        this.disciplineScientifiqueErcParentService.disciplineScientifiqueErcParentSelections = value;
       }
   
     


    get selectedDisciplineScientifiqueErcParent():DisciplineScientifiqueErcParentVo {
           return this.disciplineScientifiqueErcParentService.selectedDisciplineScientifiqueErcParent;
       }
    set selectedDisciplineScientifiqueErcParent(value: DisciplineScientifiqueErcParentVo) {
        this.disciplineScientifiqueErcParentService.selectedDisciplineScientifiqueErcParent = value;
       }
    
    get createDisciplineScientifiqueErcParentDialog():boolean {
           return this.disciplineScientifiqueErcParentService.createDisciplineScientifiqueErcParentDialog;
       }
    set createDisciplineScientifiqueErcParentDialog(value: boolean) {
        this.disciplineScientifiqueErcParentService.createDisciplineScientifiqueErcParentDialog= value;
       }
    
    get editDisciplineScientifiqueErcParentDialog():boolean {
           return this.disciplineScientifiqueErcParentService.editDisciplineScientifiqueErcParentDialog;
       }
    set editDisciplineScientifiqueErcParentDialog(value: boolean) {
        this.disciplineScientifiqueErcParentService.editDisciplineScientifiqueErcParentDialog= value;
       }
    get viewDisciplineScientifiqueErcParentDialog():boolean {
           return this.disciplineScientifiqueErcParentService.viewDisciplineScientifiqueErcParentDialog;
       }
    set viewDisciplineScientifiqueErcParentDialog(value: boolean) {
        this.disciplineScientifiqueErcParentService.viewDisciplineScientifiqueErcParentDialog = value;
       }
       
     get searchDisciplineScientifiqueErcParent(): DisciplineScientifiqueErcParentVo {
        return this.disciplineScientifiqueErcParentService.searchDisciplineScientifiqueErcParent;
       }
    set searchDisciplineScientifiqueErcParent(value: DisciplineScientifiqueErcParentVo) {
        this.disciplineScientifiqueErcParentService.searchDisciplineScientifiqueErcParent = value;
       }

    get dateFormat(){
            return environment.dateFormatList;
    }


}
